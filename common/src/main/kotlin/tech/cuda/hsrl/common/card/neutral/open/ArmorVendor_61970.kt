package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArmorVendor_61970 : Card() {
    override val id = 61970
    override val name = "护甲商贩"
    override val description = "<b>战吼：</b>使每个英雄获得4点护甲值。"
    override var cost: Int? = 1
    override var health: Int? = 3
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“一看您就是那种需要三套护甲的大客户，一套实用，一套备用，一套备用的备用。”"
    override val artist = "Maria Trepalina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/83be93c38571eb01e63758a5aa3013f5118577a7c136ac1ed0eaaaa8067bc8ca.png"
}
