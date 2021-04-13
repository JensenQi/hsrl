package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LibramOfJudgment_61949 : Card() {
    override val id = 61949
    override val name = "审判圣契"
    override val description = "<b>腐蚀：</b>获得<b>吸血</b>。"
    override var cost: Int? = 7
    override var health: Int? = null
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "你不能靠封面去评判一本书，但你可以用这本书去审判一个人。"
    override val artist = "Jason Kang"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/06b34fbce42ceff0cafefe14b1c6119be4d0745e5ba290220e7685ece9fd95d2.png"
}
