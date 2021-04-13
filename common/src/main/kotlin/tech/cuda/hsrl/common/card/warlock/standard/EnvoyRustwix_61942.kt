package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EnvoyRustwix_61942 : Card() {
    override val id = 61942
    override val name = "铁锈特使拉斯维克斯"
    override val description = "<b>亡语：</b>随机将三张终极<b>传说</b>随从牌洗入你的牌库。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“一起来吧，铁锈军团！呜呼！”"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7032901772100afe645340d0a04fcef726b553ded6cbc94d1d340bef7bf7039d.png"
}
