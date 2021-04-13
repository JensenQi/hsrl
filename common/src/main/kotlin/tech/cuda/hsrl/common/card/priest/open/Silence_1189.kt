package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Silence_1189 : Card() {
    override val id = 1189
    override val name = "沉默"
    override val description = "<b>沉默</b>一个随从。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Legacy3
    override val background = "专为施法者设计。施法者包括从墓地里钻出来的邪恶巫妖，也包括在黑铁酒吧里唱卡拉OK的麦霸。"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ac0ff25ece621d1fe9d994e7fb61d849557fed194d0b63721effb74e27e10714.png"
}
