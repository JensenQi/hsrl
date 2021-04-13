package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KingPhaoris_53336 : Card() {
    override val id = 53336
    override val name = "法奥瑞斯国王"
    override val description = "<b>战吼：</b>你手牌中每有一张法术牌，便召唤一个法力值消耗与法术牌相同的随机随从。"
    override var cost: Int? = 10
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "当你成为万猫之王时，整片沙漠都是你的猫砂盆。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/073490b423484ca3cdab03ea083f8cd28da9cc2e75786341b785fcee0f5b069a.png"
}
