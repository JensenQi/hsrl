package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Sn1pSnp_56223 : Card() {
    override val id = 56223
    override val name = "大铡蟹"
    override val description = "<b>磁力，回响，亡语：</b>召唤两个1/1的微型机器人。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.BoomsdayProject
    override val background = "“咔嚓这个，咔嚓那个；横着咔嚓，竖着咔嚓！”"
    override val artist = "Nicola Saviori"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1deacba588c94f6da63110e6886c0935c67a6b472574bbf6e41ac31825a8e21a.png"
}
