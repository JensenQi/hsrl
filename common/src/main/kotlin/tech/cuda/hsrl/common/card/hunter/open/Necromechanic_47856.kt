package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Necromechanic_47856 : Card() {
    override val id = 47856
    override val name = "死灵机械师"
    override val description = "你的<b>亡语</b>会触发 两次。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.BoomsdayProject
    override val background = "一回生，二回死，三回就……熟练了。"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/99a2c2f3f5038a429302277e07071e9e21d84d52cfb3bb1cb284e4c8f38c770f.png"
}
