package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Magicfin_61229 : Card() {
    override val id = 61229
    override val name = "鱼人魔术师"
    override val description = "在一个友方鱼人死亡后，随机将一张<b>传说</b>随从牌置入你的 手牌。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "最神奇的就是他从帽子里掏出死亡之翼的那一刻！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/32e821fbaec7260c39cc38e34963c8a3b0d84174059999dd5d1e351213a93e9a.png"
}
