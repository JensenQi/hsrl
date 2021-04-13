package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DancingCobra_61679 : Card() {
    override val id = 61679
    override val name = "舞动的眼镜蛇"
    override val description = "<b>腐蚀：</b>获得<b>剧毒</b>。"
    override var cost: Int? = 2
    override var health: Int? = 5
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "蛇，其实就是长了牙的触手。"
    override val artist = "Patrik Bjorkstrom"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/efd3393d0cd90f009f85a64c33b11b51c17c98deceb6c22d5945d32cf5294143.png"
}
