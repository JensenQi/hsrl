package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Evasion_45535 : Card() {
    override val id = 45535
    override val name = "闪避"
    override val description = "<b>奥秘：</b>你的英雄在受到伤害后，在本回合中获得<b>免疫</b>。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "可以避开武器、导弹和税收。"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/60558720c555a540de93b06fb1259cd84d21d50a246720ab36987f1c70a5ea54.png"
}
