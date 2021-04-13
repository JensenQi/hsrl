package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WobblingRunts_2961 : Card() {
    override val id = 2961
    override val name = "摇摆的俾格米"
    override val description = "<b>亡语：</b>召唤三个2/2的俾格米。"
    override var cost: Int? = 6
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Loe
    override val background = "其实还有第四个俾格米，因为没站稳而摔死了。"
    override val artist = "Sam Nielson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e3fd42055dd9fd39f8b12dc4e1a67ee5d92ac91d5527f24c9161f3895e98d595.png"
}
