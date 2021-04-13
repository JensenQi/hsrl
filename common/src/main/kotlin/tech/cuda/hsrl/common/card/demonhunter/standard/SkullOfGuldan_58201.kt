package tech.cuda.hsrl.common.card.demonhunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SkullOfGuldan_58201 : Card() {
    override val id = 58201
    override val name = "古尔丹之颅"
    override val description = "抽三张牌。<b>流放：</b>这些牌的法力值消耗减少（3）点。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "恶贯满盈之士，暗影缠身之徒。他曾千百次地蛊惑他的同族，如今想来，何其令人心生烦恶！"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9049ef414cb5c4ec2e4de7ca72945f23067318be512e378ef0b33c7815e38e71.png"
}
