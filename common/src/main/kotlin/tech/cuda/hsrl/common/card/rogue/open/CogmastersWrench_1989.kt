package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CogmastersWrench_1989 : Card() {
    override val id = 1989
    override val name = "齿轮大师的扳手"
    override val description = "如果你控制任何机械，便获得 +2攻击力。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Gvg
    override val background = "扳手的用途很广泛，包括旋紧齿轮和打扁穴居人。"
    override val artist = "Richard Wright"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/dd4d03c0dfa877e789420281edf61c542a852e1383f15fe9c9fc76735e8fb9ac.png"
}
