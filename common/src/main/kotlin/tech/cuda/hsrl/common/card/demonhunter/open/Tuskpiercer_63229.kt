package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Tuskpiercer_63229 : Card() {
    override val id = 63229
    override val name = "獠牙锥刃"
    override val description = "<b>亡语：</b>抽一张<b>亡语</b>随从牌。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "在贫瘠之地，万物皆有獠牙！野猪人长着獠牙，野猪长着獠牙，獠牙也长着獠牙。"
    override val artist = "Kagi "
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/24eef6d7cd736eed9f78955bb3f8448fb03cbc0f938884d10aadceabad20df0f.png"
}
