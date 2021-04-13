package tech.cuda.hsrl.common.card.shaman.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpeakerGidra_59253 : Card() {
    override val id = 59253
    override val name = "演讲者吉德拉"
    override val description = "<b>突袭，风怒</b> <b>法术迸发：</b>获得等同于法术法力值消耗的攻击力和生命值。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "如果一个讲师在森林中发表了一次无人倾听的演讲，那么实际上她是否发出了声音？"
    override val artist = "Paul Mafayon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e58712f736ffe18588a077cb5e8154f0fdde556c186fa33b77fa1189250c2ada.png"
}
