package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolyNova_841 : Card() {
    override val id = 841
    override val name = "神圣新星"
    override val description = "对所有敌方随从造成 2点伤害，为所有友方角色恢复 2点 生命值。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy1635
    override val background = "没有得到圣光眷顾的人切忌使用这个法术，它滋润善者，惩罚恶徒。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bbfb6cba39d712c666c11a25c557e3b60cc70296a815d10abd9df9ef52a0cd31.png"
}
