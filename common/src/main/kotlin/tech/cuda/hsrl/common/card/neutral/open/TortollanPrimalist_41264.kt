package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TortollanPrimalist_41264 : Card() {
    override val id = 41264
    override val name = "始祖龟预言者"
    override val description = "<b>战吼：</b> <b>发现</b>一张法术牌，并向随机目标施放。"
    override var cost: Int? = 8
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Ungoro
    override val background = "我在未来看到有吃不完的披萨。"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/181881e5c6aeb9a6b041a71f87f1d8332bbcf182f900cc69bf4a8ce27892a3f8.png"
}
