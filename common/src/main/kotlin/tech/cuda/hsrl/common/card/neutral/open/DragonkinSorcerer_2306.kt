package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DragonkinSorcerer_2306 : Card() {
    override val id = 2306
    override val name = "龙人巫师"
    override val description = "每当<b>你</b>以该随从为目标施放一个法术时，便获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Brm
    override val background = "当龙人巫师向大家说道：“我来给大家变个戏法”的时候，大家都走开了，因为没人要看他从龙变成人的把戏。"
    override val artist = "Edouard Guiton & Stuido HIVE"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4510cb29ea75608f0cc7cee06e14020484922fac387637f1bd23886591e844e4.png"
}
