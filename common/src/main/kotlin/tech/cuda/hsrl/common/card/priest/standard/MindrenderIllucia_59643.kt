package tech.cuda.hsrl.common.card.priest.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MindrenderIllucia_59643 : Card() {
    override val id = 59643
    override val name = "裂心者伊露希亚"
    override val description = "<b>战吼：</b>直到你的下个回合，和你的对手交换手牌和牌库。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“……后来我就这么被换到了鱼人文化研究专业。”"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e77230bad0b2dbef38d874e22196df6aa14ee9150bf2eba549ac7598dffb4646.png"
}
