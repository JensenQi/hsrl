package tech.cuda.hsrl.common.card.priest.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Silence_69926 : Card() {
    override val id = 69926
    override val name = "沉默寡言"
    override val description = "<b>沉默</b>一个随从。"
    override var cost: Int? = null
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.ClassicCards
    override val background = "专为施法者设计。施法者包括从墓地里钻出来的邪恶巫妖，也包括在黑铁酒吧里唱卡拉OK的麦霸。"
    override val artist = "Zoltan & Gabor"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/774a23a2c46cb6e8ac462d6285a33585d2cb785ffcd81cfa909b02fe1ad9b71f.png"
}
