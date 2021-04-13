package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CobraShot_2041 : Card() {
    override val id = 2041
    override val name = "眼镜蛇射击"
    override val description = "对一个随从和敌方英雄造成 3点伤害。"
    override var cost: Int? = 5
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Gvg
    override val background = "戴眼镜的蛇当然会瞄的更准一点。"
    override val artist = "Howard Lyon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1f9ebc12a286846732362c3bcbedc5c7f9a483b2c73d93917598828f4023ff98.png"
}
