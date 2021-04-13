package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TortollanForager_41252 : Card() {
    override val id = 41252
    override val name = "始祖龟劫掠者"
    override val description = "<b>战吼：</b>随机将一张攻击力大于或等于5的随从牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Ungoro
    override val background = "在始祖龟语里，“安戈洛”指的是“失落的世界”。"
    override val artist = "Jerry Mascho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1efffed340c43203d6e77a4aa2b78ca29de36d70d050fce070b29d041d79a141.png"
}
