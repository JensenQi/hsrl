package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StoneskinBasilisk_43474 : Card() {
    override val id = 43474
    override val name = "石皮蜥蜴"
    override val description = "<b>圣盾</b> <b>剧毒</b>"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "有一次他不小心看了一眼镜子。"
    override val artist = "Julian Del Rey"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9458035ff851e76869862229d205373da98b4ba446dd131e7424f4e60c0f5c04.png"
}
