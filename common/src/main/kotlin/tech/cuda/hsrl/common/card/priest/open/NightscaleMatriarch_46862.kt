package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NightscaleMatriarch_46862 : Card() {
    override val id = 46862
    override val name = "夜鳞龙后"
    override val description = "每当一个友方随从获得治疗时，召唤一条3/3的雏龙。"
    override var cost: Int? = 7
    override var health: Int? = 9
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.TheWitchwood
    override val background = "所有龙，都过来！"
    override val artist = "Slawomir Maniak"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/59ffe4ea9666fbd523fe609156b147e5ac568d980e2562636d161ded42730e96.png"
}
