package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Spellzerker_50083 : Card() {
    override val id = 50083
    override val name = "狂暴咒术师"
    override val description = "受伤时具有 <b>法术伤害+2</b>。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "受伤的时候念咒声音特别大，因为疼。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e8f37277e22daf0761023e9439d6e5ae2db5247264a33449552cd794348926f6.png"
}
