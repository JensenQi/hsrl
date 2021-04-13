package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CoilfangWarlord_60280 : Card() {
    override val id = 60280
    override val name = "盘牙督军"
    override val description = "<b>突袭，亡语：</b>召唤一个5/9并具有<b>嘲讽</b> 的督军。"
    override var cost: Int? = 8
    override var health: Int? = 5
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.AshesOfOutland
    override val background = "设法发射蛇发半人蛇！"
    override val artist = "Kagi"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b3d886615fb1a88348da2f812e5a269ff400b9c7a0c457a8bb695a7893d71bae.png"
}
