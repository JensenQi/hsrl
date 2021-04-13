package tech.cuda.hsrl.common.card.warrior.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SwordEater_61237 : Card() {
    override val id = 61237
    override val name = "吞剑艺人"
    override val description = "<b>嘲讽，战吼：</b>装备一把3/2的剑。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Pirate
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "这家伙有多狠？他每天的早餐就是一把剑！连牛奶都不喝。"
    override val artist = "Mike Sass"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7ec67547cc45a522440b779c99abfb3f46fef26a81e12c6713fd5885fb8ebadd.png"
}
