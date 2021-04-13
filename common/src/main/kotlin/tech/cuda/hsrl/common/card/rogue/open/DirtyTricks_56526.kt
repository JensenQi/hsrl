package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DirtyTricks_56526 : Card() {
    override val id = 56526
    override val name = "邪恶计谋"
    override val description = "<b>奥秘：</b>在你的对手施放一个法术后，抽两张牌。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.AshesOfOutland
    override val background = "“啊！我迷眼睛了！咦，我还挨了一刀。”"
    override val artist = "David Kegg"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6c96a0ecf56d2c7144c90aff575d10066207fa5e2bca233fe2fe8a4088aeb0ee.png"
}
