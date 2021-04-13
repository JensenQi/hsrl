package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StoneskinBasilisk_69725 : Card() {
    override val id = 69725
    override val name = "石皮蜥蜴"
    override val description = "<b>圣盾</b> <b>剧毒</b>"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "有一次他不小心看了一眼镜子。"
    override val artist = "Julian Del Rey"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b9b24b9f6801c0fe9648e6e1e783e0d05c3c9ad3a7aa58c0fb8efca36109ce87.png"
}
