package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PowerWordTentacles_38426 : Card() {
    override val id = 38426
    override val name = "真言术：触"
    override val description = "使一个随从获得+2/+6。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Wotog
    override val background = "这么多触手都是保护我的吗？要是拿不下来该怎么办……"
    override val artist = "Jesper Ejsing"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f42260800b586b8ab255ee9feef82e454087c59cbf386438632cefe98c4e11fe.png"
}
