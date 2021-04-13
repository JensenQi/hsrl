package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HolyWrath_435 : Card() {
    override val id = 435
    override val name = "神圣愤怒"
    override val description = "抽一张牌，并造成等同于其法力值消耗的伤害。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy3
    override val background = "来个熔核巨人吧！！"
    override val artist = "Justin Sweet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1fffd3ecfbe03f9768cf494c25c26c9c57031934d147c08ef8a506ebfd683c03.png"
}
