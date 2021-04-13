package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DreamwayGuardians_52810 : Card() {
    override val id = 52810
    override val name = "守卫梦境之路"
    override val description = "召唤两个1/2并具有<b>吸血</b>的 树妖。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RiseOfShadows
    override val background = "她们就是梦境之路上的噩梦。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7fda6f4fb70ac36703fd852cfe73c1837e5304a9ae975bf40fed6426a17ca323.png"
}
