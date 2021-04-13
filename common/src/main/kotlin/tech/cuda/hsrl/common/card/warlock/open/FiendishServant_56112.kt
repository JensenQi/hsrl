package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FiendishServant_56112 : Card() {
    override val id = 56112
    override val name = "邪魔仆从"
    override val description = "<b>亡语：</b>随机使一个友方随从获得该随从的攻击力。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "当仆从只是邪魔的爱好，主人是谁无所谓。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/379e1beaef5ccdbe5e3294f1239a6f4e6f836f7f7d5c233916c29f5a67012962.png"
}
