package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Pounce_49990 : Card() {
    override val id = 49990
    override val name = "飞扑"
    override val description = "在本回合中，使你的英雄获得+2攻击力。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RastakhansRumble
    override val background = "喵的一声就扑到了最近的盒子里。"
    override val artist = "Rudy Siswanto"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b27ef018603a1646ad357a1213745b4b1688ad85f2997463b42a450cd1e002ad.png"
}
