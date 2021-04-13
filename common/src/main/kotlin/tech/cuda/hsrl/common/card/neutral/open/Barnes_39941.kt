package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Barnes_39941 : Card() {
    override val id = 39941
    override val name = "巴内斯"
    override val description = "<b>战吼：</b>随机挑选你牌库里的一个随从，召唤一个1/1的复制。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "他之前能扮演任何角色，直到莫罗斯没收了他的欺诈宝珠。"
    override val artist = "Garrett Hanna"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2a31550a0822f49960f6c57a8124ea89733da028a67accbed5eaf4e3dad42b1d.png"
}
