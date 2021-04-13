package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CondemnRank1_62878 : Card() {
    override val id = 62878
    override val name = "罪罚（等级1）"
    override val description = "对所有敌方随从造成 1点伤害。<i>（当你有5点法力值时升级。）</i>"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“我无意伤害你们，但你们实在过于残忍，以圣光之名，我要向你们施加罪罚！”泽瑞拉大声喊着，却没有意识到自己的“狠话”其实一点也不狠。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5dfddd8b064832a9063e0336215492904675eba1711d8a53335cae08c02a31c8.png"
}
