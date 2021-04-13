package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ZerekMasterCloner_48203 : Card() {
    override val id = 48203
    override val name = "克隆大师泽里克"
    override val description = "<b>亡语：</b>如果你对该随从施放过任意法术，再次召唤该随从。"
    override var cost: Int? = 6
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.BoomsdayProject
    override val background = "他的本体名叫泽里克1.0，第一个扩展体叫泽里克2.0，现在叫泽里克12.0。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/797cce44f60cac157405fccdd40e480525b1ed30dfab4231e2b0304f3afbd34f.png"
}
