package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Equality_756 : Card() {
    override val id = 756
    override val name = "生而平等"
    override val description = "将所有随从的生命值变为1。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy3
    override val background = "正因为我们都是独一无二的，所以我们都是平等的。"
    override val artist = "Michal Ivan"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7b93140eece996782f76bd3d400a68e54215a4a351230191b729f3307b95b092.png"
}
