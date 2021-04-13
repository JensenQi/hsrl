package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ScarletWebweaver_53609 : Card() {
    override val id = 53609
    override val name = "猩红织网蛛"
    override val description = "<b>战吼：</b>随机使你手牌中的一张野兽牌的 法力值消耗减少（5）点。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.SaviorsOfUldum
    override val background = "不错吧？织网蛛给探险者赞助了一个睡袋！"
    override val artist = "Andrew Hou"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d754f5fe18010e5802c4573406783ed7a72c164cdc0c5f0edac54fa861ce2630.png"
}
