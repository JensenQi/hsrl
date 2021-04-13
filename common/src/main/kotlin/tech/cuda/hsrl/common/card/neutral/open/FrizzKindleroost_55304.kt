package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FrizzKindleroost_55304 : Card() {
    override val id = 55304
    override val name = "弗瑞兹·光巢"
    override val description = "<b>战吼：</b>使你牌库中龙牌的法力值消耗减少（2）点。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.DescentOfDragons
    override val background = "弗瑞兹深知龙宝宝们需要温暖的环境，精心的照顾，以及最顶尖的地精工程学。"
    override val artist = "Ivan Fomin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0ae7585de9631265566567f842ad2749362d098997d1581bf4480d3a9307bf0f.png"
}
