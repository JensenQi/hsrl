package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DefiasRingleader_201 : Card() {
    override val id = 201
    override val name = "迪菲亚头目"
    override val description = "<b>连击：</b>召唤一个2/1的迪菲亚强盗。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.Legacy3
    override val background = "他在数年前偷走了地契，所以理论上说这片地盘确实是他的。他还喜欢用“白痴”称呼别人，显得自己很有势力。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bd242fa1e3f7c1039b3dc7e3d5a6d40a5c7af9663458ecca415a558a184efac1.png"
}
