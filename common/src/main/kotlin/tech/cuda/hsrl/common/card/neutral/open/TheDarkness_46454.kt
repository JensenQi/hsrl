package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TheDarkness_46454 : Card() {
    override val id = 46454
    override val name = "黑暗之主"
    override val description = "起始<b>休眠</b>状态。 <b>战吼：</b>将三张蜡烛牌洗入对手的牌库。抽到三张蜡烛牌后唤醒该随从。"
    override var cost: Int? = 4
    override var health: Int? = 20
    override var attack: Int? = 20
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "与其诅咒黑暗，不如点亮蜡烛。不过我还是喜欢两件事一起做。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dcf3833e58343ef02c8701ffeaa3560972c79d4c16c3919319d0845e3b4e3d7e.png"
}
