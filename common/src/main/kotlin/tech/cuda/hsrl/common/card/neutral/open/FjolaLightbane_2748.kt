package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FjolaLightbane_2748 : Card() {
    override val id = 2748
    override val name = "光明邪使菲奥拉"
    override val description = "每当<b>你</b>以该随从为目标施放一个法术时，便获得<b><b>圣盾</b>。</b>"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "她最爱被别人叫“邪使姐妹花”了。"
    override val artist = "Mark Zug"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/db7c2b36647321a7712f7b7cc709ba30da1a3d7fdfd25ce204e9b4630df25bf2.png"
}
