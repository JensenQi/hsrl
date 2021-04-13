package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class KathrenaWinterwisp_46390 : Card() {
    override val id = 46390
    override val name = "卡瑟娜·冬灵"
    override val description = "<b>战吼，亡语：</b><b>招募</b>一个野兽。"
    override var cost: Int? = 8
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "她不是那种喜欢抱着树的精灵，不过偶尔的拥抱还是很让人舒服的。"
    override val artist = "Garrett Hanna"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0cf44c092c29dbda6a12bcd0d47e0455be57e3e9c9d42ec2e19585b574478cfb.png"
}
