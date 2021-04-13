package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LeperGnome_658 : Card() {
    override val id = 658
    override val name = "麻风侏儒"
    override val description = "<b>亡语：</b>对敌方英雄造成2点伤害。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy3
    override val background = "他真的很想和你做朋友，但由于总是被排斥，他开始变得很沮丧。"
    override val artist = "Glenn Rane"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9e96c435b159aea95d34c3fd45aaa0715990e54bdece35683b167adf8c6009d9.png"
}
