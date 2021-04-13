package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OasisSnapjaw_1370 : Card() {
    override val id = 1370
    override val name = "绿洲钳嘴龟"
    override val description = ""
    override var cost: Int? = 4
    override var health: Int? = 7
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Free
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "它的梦想是能够像它的偶像那样飞行和吐息火焰，但这样的梦想永远无法实现。"
    override val artist = "Ittoku"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/223b4eb93a032dffdf3f334515522f3d2d47feb2dc7fce0630938c2a7a198386.png"
}
