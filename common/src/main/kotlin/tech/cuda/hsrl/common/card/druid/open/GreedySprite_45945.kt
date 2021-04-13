package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class GreedySprite_45945 : Card() {
    override val id = 45945
    override val name = "贪婪的林精"
    override val description = "<b>亡语：</b>获得一个空的法力水晶。"
    override var cost: Int? = 3
    override var health: Int? = 1
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "七只林精中最闪耀的一只。"
    override val artist = "L. Lullabi & K. Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8846803bd93baf1393649ad66afb9ef1c3063c79b30e970a2e9b9ca8a8c34bd4.png"
}
