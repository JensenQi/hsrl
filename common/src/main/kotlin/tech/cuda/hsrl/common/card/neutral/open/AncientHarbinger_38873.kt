package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncientHarbinger_38873 : Card() {
    override val id = 38873
    override val name = "上古之神先驱"
    override val description = "在你的回合开始时，将一个法力值消耗为（10）的随从从你的牌库置入你的手牌。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "先驱的主要工作就是为身后的狠角色们预先暖场。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8fe568f302aac6f97e8066a8218323035d69ac31e955f8916618b2136326e42a.png"
}
