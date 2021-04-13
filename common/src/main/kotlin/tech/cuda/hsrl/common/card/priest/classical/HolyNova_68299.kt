package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolyNova_68299 : Card() {
    override val id = 68299
    override val name = "神圣新星"
    override val description = "对所有敌人造成 2点伤害，为所有友方角色 恢复 2点生命值。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "没有得到圣光眷顾的人切忌使用这个法术，它滋润善者，惩罚恶徒。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8a3641593c7b0c09c4d584f606ec69cd401d98ed8f579e9da5515828cb220694.png"
}
