package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class UnsleepingSoul_51847 : Card() {
    override val id = 51847
    override val name = "不眠之魂"
    override val description = "<b>沉默</b>一个友方随从，然后召唤一个它的复制。"
    override var cost: Int? = 4
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.RiseOfShadows
    override val background = "凌晨三点，你还知道你的魂在哪里吗？"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a531816d0bf0b34a1267f08bb952063e613b7363b655b5dfbbcdd5c4c6fb58eb.png"
}
