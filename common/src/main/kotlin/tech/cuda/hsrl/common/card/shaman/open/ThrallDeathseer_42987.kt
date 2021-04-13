package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ThrallDeathseer_42987 : Card() {
    override val id = 42987
    override val name = "死亡先知萨尔"
    override val description = "<b>战吼：</b>随机将你的所有随从变形成为法力值消耗增加（2）点的随从。"
    override var cost: Int? = 5
    override var health: Int? = 30
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Hero
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.Kotf
    override val background = "“不要害怕。过来。亡者会沉睡……一段时间。”"
    override val artist = "Jerry Mascho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4338dd15398ffcf824f4ed9165808e508eeab080ff3cb6ef5b8b9d9c990241a4.png"
}
