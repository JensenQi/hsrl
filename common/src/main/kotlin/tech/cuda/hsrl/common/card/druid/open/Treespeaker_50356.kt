package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Treespeaker_50356 : Card() {
    override val id = 50356
    override val name = "树语者"
    override val description = "<b>战吼：</b> 将你的所有树人变形成为5/5的古树。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RastakhansRumble
    override val background = "他有点木讷，表情也很僵硬。"
    override val artist = "J. Axer"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d367341e08f3d2d0fc2bfa864c891020644688fdb15b07d8299858b44ed3d581.png"
}
