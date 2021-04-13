package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TentTrasher_61252 : Card() {
    override val id = 61252
    override val name = "帐篷摧毁者"
    override val description = "<b>突袭</b> 每有一个随从类型不同的友方随从，该牌的法力值消耗便减少（1）点。"
    override var cost: Int? = 5
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“我觉得这叫重新装修。”"
    override val artist = "Mauricio Herrera"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/42718229f1905d4b068a49b1301c4a9a6144540b75009af22728f528736ffdeb.png"
}
