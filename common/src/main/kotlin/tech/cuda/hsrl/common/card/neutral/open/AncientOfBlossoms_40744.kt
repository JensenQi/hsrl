package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class AncientOfBlossoms_40744 : Card() {
    override val id = 40744
    override val name = "远古之树"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 6
    override var health: Int? = 8
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Msog
    override val background = "他把树叶染成了粉红色，好看吧！"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d41d23834f4bfc001c72bc0dd5596f1a19c4caee75313f8806a789aaeadccbe9.png"
}
