package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class OpenTheCages_61683 : Card() {
    override val id = 61683
    override val name = "打开兽笼"
    override val description = "<b>奥秘：</b>当你的回合开始时，如果你控制着两个随从，召唤一个动物伙伴。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“都出来吧，我活不到第九回合了……”"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b044c3890e44c3f4fd925ad6ecfcf3971f54ee11677628a2e28352f1fefe4705.png"
}
